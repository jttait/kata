const { fibonacciBelow, sumFibonacciEvenBelow } = require('./fibonacci')

test('[0, 1, 1] is fibonacci sequence below 2', () => {
  expect(fibonacciBelow(2)).toEqual([0, 1, 1])
})

test('[0, 1, 1, 2] is fibonacci sequence below 3', () => {
  expect(fibonacciBelow(3)).toEqual([0, 1, 1, 2])
})

test('[0, 1, 1, 2, 3, 5] is fibonacci sequence below 6', () => {
  expect(fibonacciBelow(6)).toEqual([0, 1, 1, 2, 3, 5])
})

test('2 is sum of even valued fibonacci numbers below 3', () => {
  expect(sumFibonacciEvenBelow(3)).toEqual(2)
})

test('2 is sum of even valued fibonacci numbers below 6', () => {
  expect(sumFibonacciEvenBelow(6)).toEqual(2)
})

test('44 is sum of even valued fibonacci numbers below 90', () => {
  expect(sumFibonacciEvenBelow(90)).toEqual(44)
})


test('4613732 is sum of even valued fibonacci numbers below 4000000', () => {
  expect(sumFibonacciEvenBelow(4000000)).toEqual(4613732)
})
