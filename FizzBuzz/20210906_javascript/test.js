const fizzbuzz = require('./fizzbuzz.js')

test('fizzbuzz of 1', () => {
  expect(fizzbuzz(1)).toBe(1)
})

test('fizzbuzz of 2', () => {
  expect(fizzbuzz(2)).toBe(2)
})

test('fizzbuzz of 3', () => {
  expect(fizzbuzz(3)).toBe('fizz')
})

test('fizzbuzz of 5', () => {
  expect(fizzbuzz(5)).toBe('buzz')
})

test('fizzbuzz of 6', () => {
  expect(fizzbuzz(6)).toBe('fizz')
})

test('fizzbuzz of 10', () => {
  expect(fizzbuzz(10)).toBe('buzz')
})

test('fizzbuzz of 15', () => {
  expect(fizzbuzz(15)).toBe('fizzbuzz')
})

test('fizzbuzz of 30', () => {
  expect(fizzbuzz(30)).toBe('fizzbuzz')
})
