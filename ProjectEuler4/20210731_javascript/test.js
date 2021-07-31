const {
  isPalindrome,
  largestPalindromeOf2digitNumbers,
  largestPalindromeOf3digitNumbers
} = require('./palindromes')

test('abba is palindrome', () => {
  expect(isPalindrome('abba')).toBeTruthy()
})

test('abcd is not palindrome', () => {
  expect(isPalindrome('abcd')).toBeFalsy()
})

test('9009 is palindrome', () => {
  expect(isPalindrome('9009')).toBeTruthy()
})

test('9009 is largest palindrome product of 2 digit numbers', () => {
  expect(largestPalindromeOf2digitNumbers()).toEqual(9009)
})

test('906609 is largest palindrome product of 3 digit numbers', () => {
  expect(largestPalindromeOf3digitNumbers()).toEqual(906609)
})
