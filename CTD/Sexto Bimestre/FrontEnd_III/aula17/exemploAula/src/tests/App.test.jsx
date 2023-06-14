import { render, screen } from "@testing-library/react"
import { Button } from '../components/button';

describe('Testa soma de inteiros', () => {
  it('Deve somar dois números e espera que o resultado seja 3', () => {
    //Arrange
    const n1 = 2
    const n2 = 3
    //Act
    const result = n1 + n2
    //Assert
    expect(result).toBe(5)
  });
});

describe('<Button /> tests', () => {
  it("Deve renderizar o componente", () => {
    render(<Button />)
  })
  it("Botão deve estar desabilitado", () => {
    render(<Button />)
    const button = screen.getByRole("button")
    expect(button).toHaveAttribute("disabled")
  })
})

