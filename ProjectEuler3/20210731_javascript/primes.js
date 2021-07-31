const primeFactors = (number) => {
  const factors = []
  while (number % 2 === 0) {
    factors.push(2)
    number /= 2
  }
  for (let i = 3; i * i <= number; i += 2) {
    if (number % i === 0) {
      factors.push(i)
      number /= i
    }
  }
  if (number > 2) {
    factors.push(number)
  }
  return factors
}

const largestPrimeFactor = (number) => {
  return Math.max(...primeFactors(number))
}

module.exports = { primeFactors, largestPrimeFactor }
