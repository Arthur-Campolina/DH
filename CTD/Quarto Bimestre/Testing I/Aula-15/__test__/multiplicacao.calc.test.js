const { multiplicacao } = require('../calc/calc.js');

describe('Testes de multiplicação',() => {
  test('Multiplicação de dois números', () => {
    expect(multiplicacao(5,3)).toBe(15);
  });
});