const { isMultipleOfAny, sumOfMultiplesBelow } = require('./index')

const MULTIPLES = [3, 5]

test('1 is not multiple', () => {
  expect(isMultipleOfAny(1, MULTIPLES)).toBe(false)
})

test('2 is not multiple', () => {
  expect(isMultipleOfAny(2, MULTIPLES)).toBe(false)
})

test('3 is multiple', () => {
  expect(isMultipleOfAny(3, MULTIPLES)).toBe(true)
})

test('5 is multiple', () => {
  expect(isMultipleOfAny(5, MULTIPLES)).toBe(true)
})

test('15 is multiple', () => {
  expect(isMultipleOfAny(15, MULTIPLES)).toBe(true)
})

test('0 is sum of multiples below 3', () => {
  expect(sumOfMultiplesBelow(3, MULTIPLES)).toBe(0)
})

test('3 is sum of multiples below 4', () => {
  expect(sumOfMultiplesBelow(4, MULTIPLES)).toBe(3)
})

test('23 is sum of multiples below 10', () => {
  expect(sumOfMultiplesBelow(10, MULTIPLES)).toBe(23)
})

test('233168 is sum of multiples below 1000', () => {
  expect(sumOfMultiplesBelow(1000, MULTIPLES)).toBe(233168)
})
