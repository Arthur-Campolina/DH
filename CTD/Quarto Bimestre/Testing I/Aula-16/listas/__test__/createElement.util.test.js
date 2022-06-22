const { createElement } = require("../util.js");

describe("Criar um novo elemento HTML", () => {
  test("Retornar um novo elemento HTML", () => {
    const newElement = createElement("String", "text", "className");
    expect(newElement).toBe("Moro em BH (endereco)");
  });
});
