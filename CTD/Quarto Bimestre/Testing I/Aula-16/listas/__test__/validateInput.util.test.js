const { validateInput } = require("../util.js");

describe("Validar o input do usuario", () => {
  test("Validar o input do usuario", () => {
    const text = validateInput("String", false, false);
    expect(text).toBe(true);
  });
});
