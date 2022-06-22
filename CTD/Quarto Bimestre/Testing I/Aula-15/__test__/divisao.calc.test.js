const { divisao } = require('../calc/calc.js');


describe('Testes de divisão', () => {
  test ('Divisão de dois números', () => {
    expect(divisao(6,3)).toBe(2);
  });

  test ('Divisão de dois zeros', () => {
    expect(divisao(0,0)).toBe(NaN);
  });

  test ('Divisão de dois nulos', () => {
    expect(divisao(null,null)).toBe(NaN);
  });

  test ('Divisão de duas strings', () => {
    expect(divisao('a','b')).toBe(NaN);
  });
});