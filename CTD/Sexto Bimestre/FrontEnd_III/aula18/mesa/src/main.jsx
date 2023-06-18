import { BrowserRouter, Routes, Route, Navigate } from 'react-router-dom';
import './index.css';
import ReactDOM from 'react-dom/client';
import { Home } from './pages/Home';
import { NotFound } from './pages/NotFound';
import { HotelDetails } from './pages/HotelDetails';

ReactDOM.createRoot(document.getElementById('root')).render(
  <BrowserRouter>
    <Routes>
      <Route path='*' element={<NotFound />} />
      <Route path='/' element={<Navigate to={'/home'} />} />
      <Route path='/home' element={<Home />} />
      <Route path='/details/:id' element={<HotelDetails />} />
    </Routes>
  </BrowserRouter>
);