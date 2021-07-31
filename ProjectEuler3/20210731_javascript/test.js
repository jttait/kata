const { primeFactors, largestPrimeFactor } = require('./primes')

test('[2] is prime factors of 2', () => {
  expect(primeFactors(2)).toEqual([2])
})

test('[3] is prime factors of 3', () => {
  expect(primeFactors(3)).toEqual([3])
})

test('[2, 2] is prime factors of 4', () => {
  expect(primeFactors(4)).toEqual([2, 2])
})

test('[5] is prime factors of 5', () => {
  expect(primeFactors(5)).toEqual([5])
})

test('[2, 3] is prime factors of 6', () => {
  expect(primeFactors(6)).toEqual([2, 3])
})

test('[7] is prime factors of 7', () => {
  expect(primeFactors(7)).toEqual([7])
})

test('[2, 2, 2] is prime factors of 8', () => {
  expect(primeFactors(8)).toEqual([2, 2, 2])
})

test('[3, 3] is prime factors of 9', () => {
  expect(primeFactors(9)).toEqual([3, 3])
})

test('[2, 5] is prime factors of 10', () => {
  expect(primeFactors(10)).toEqual([2, 5])
})

test('[5, 7, 13, 29] is prime factors of 13195', () => {
  expect(primeFactors(13195)).toEqual([5, 7, 13, 29])
})

test('[71, 839, 1471, 6857] is prime factors of 600851475143', () => {
  expect(primeFactors(600851475143)).toEqual([71, 839, 1471, 6857])
})

test('29 is largest prime factor of 13195', () => {
  expect(largestPrimeFactor(13195)).toEqual(29)
})

test('6857 is largest prime factor of 600851475143', () => {
  expect(largestPrimeFactor(600851475143)).toEqual(6857)
})
