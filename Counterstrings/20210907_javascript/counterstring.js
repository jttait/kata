const counterstring = (length) => {
  if (length === 0) {
    return ''
  }

  let position = 1
  let result = '*'
  while (position < length) {
    const originalPosition = position
    const originalNumberOfDigits = numberOfDigits(position)
    position += numberOfDigits(position)
    const newNumberOfDigits = numberOfDigits(position)
    const difference = newNumberOfDigits - originalNumberOfDigits
    position += difference
    position++

    const remainingCharacters = length - originalPosition
    result += position.toString().substring(0, remainingCharacters)

    if (remainingCharacters - newNumberOfDigits > 0) {
      result += '*'
    }
  }
  return result
}

const numberOfDigits = (integer) => {
  return integer.toString().length
}

module.exports = counterstring
