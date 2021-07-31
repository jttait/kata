const fibonacciBelow = (endExclusive) => {
  const sequence = [0, 1]
  let index = 1
  while (nextFibonacciNumber(sequence, index) < endExclusive) {
    sequence[index + 1] = nextFibonacciNumber(sequence, index)
    index++
  }
  return sequence
}

const nextFibonacciNumber = (sequence, index) => {
  return sequence[index] + sequence[index - 1]
}

const sumFibonacciEvenBelow = (endExclusive) => {
  return fibonacciBelow(endExclusive).filter((x) => x % 2 === 0).reduce((a, b) => a + b, 0)
}

module.exports = { fibonacciBelow, sumFibonacciEvenBelow }
