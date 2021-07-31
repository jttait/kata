const isMultipleOfAny = (num, multiples) => {
  for (const multiple of multiples) {
    if (num % multiple === 0) {
      return true
    }
  }
  return false
}

const sumOfMultiplesBelow = (limit, multiples) => {
  let sum = 0
  for (let i = 1; i < limit; i++) {
    if (isMultipleOfAny(i, multiples)) {
      sum += i
    }
  }
  return sum
}

module.exports = { isMultipleOfAny, sumOfMultiplesBelow }
