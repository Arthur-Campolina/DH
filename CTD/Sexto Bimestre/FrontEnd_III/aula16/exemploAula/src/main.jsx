import React from "react";
import ReactDOM from "react-dom/client";
import './index.css'
import { createServer, Model } from "miragejs";

import App from "./App";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import { Page1 } from "./pages/Page1";
import { PageNotFound } from "./pages/PageNotFound";
import { Layout } from "./components/Layout";
import { Page2 } from "./pages/Page2";
import { Page3 } from "./pages/Page3";

createServer({
  models: {
    product: Model,
  },

  seeds(server) {
    server.create("product", {
      id: 1,
      title: "Brown Perfume",
      description: "Royal_Mirage Sport Brown Perfu...",
      price: 40,
      stock: 52,
      category: "fragrances",
      image: "https://dummyjson.com/image/i/products/12/thumbnail.jpg",
    });

    server.create("product", {
      id: 10,
      title: "HP Pavilion 15-DK1056WM",
      description: "HP Pavilion 15-DK1056WM Gaming...",
      price: 1099,
      stock: 89,
      brand: "HP Pavilion",
      category: "laptops",
      image: "https://dummyjson.com/image/i/products/10/thumbnail.jpeg",
    });

  },

  routes() {
    this.namespace = "api/products";

    this.get("/", (schema, request) => {
      return schema.products.all();
    });

    this.get("/:id", (schema, request) => {
      let id = request.params.id;
      return schema.products.find(id);
    });

    this.put("/:id", (schema, request) => {
      let newAttrs = JSON.parse(request.requestBody);
      let id = request.params.id;
      let product = schema.products.find(id);
      return product.update(newAttrs);
    });

    this.post("/", (schema, request) => {
      let attrs = JSON.parse(request.requestBody);
      return schema.products.create(attrs);
    });

    this.delete("/:id", (schema, request) => {
      let id = request.params.id;
      return schema.products.find(id).destroy();
    });
  },
});

ReactDOM.createRoot(document.getElementById("root")).render(
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<Layout />}>
        <Route path="/home" element={<App />} />
        <Route path="/pagina1" element={<Page1 />} />
        <Route path="/pagina2" element={<Page2 />} />
        <Route path="/pagina3" element={<Page3 />} />
        <Route path="*" element={<PageNotFound />} />
      </Route >
    </Routes>
  </BrowserRouter>
);
