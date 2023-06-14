import { fireEvent, render, screen } from "@testing-library/react"
import { Form } from "../components/Form"
import { Button } from "../components/button"

describe("Testa formulário", () => {
    it("O input não deverá receber valores numéricos", () => {
        render(<Form />)
        const input = screen.getByAltText("name")
        expect(input.value).not.toBe(expect.any(Number))
    })
    it("O botão deverá disparar o evento", () => {
        const click = jest.fn();
        render(<Button onClick={click} />)
        const button = screen.getByRole("button")
        fireEvent.click(button)
        expect(click).toHaveBeenCalledTimes(1)
    })
})