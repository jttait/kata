const isPalindrome = (string) => {
  let start = 0
  let end = string.length - 1
  while (start < end) {
    if (string[start] !== string[end]) {
      return false
    }
    start++
    end--
  }
  return true
}

const largestPalindromeOf2digitNumbers = () => {
  let largestPalindrome = 0
  for (let i = 99; i > 0; i--) {
    for (let j = 99; j > 0; j--) {
      const product = i * j
      if (isPalindrome(product.toString())) {
        if (product > largestPalindrome) {
          largestPalindrome = product
        }
      }
    }
  }
  return largestPalindrome
}

const largestPalindromeOf3digitNumbers = () => {
  let largestPalindrome = 0
  for (let i = 999; i > 0; i--) {
    for (let j = 999; j > 0; j--) {
      const product = i * j
      if (isPalindrome(product.toString())) {
        if (product > largestPalindrome) {
          largestPalindrome = product
        }
      }
    }
  }
  return largestPalindrome
}

module.exports = {
  isPalindrome,
  largestPalindromeOf2digitNumbers,
  largestPalindromeOf3digitNumbers
}
