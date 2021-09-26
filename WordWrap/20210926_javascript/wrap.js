const wrap = (text, maxLineLength) => {
  if (text.length <= maxLineLength) {
    return text
  }

  const spaceToBreakAt = text.lastIndexOf(' ', maxLineLength)

  if (spaceToBreakAt === -1) {
    return breakInMiddleOfWord(text, maxLineLength)
  }
  return breakAtSpace(text, spaceToBreakAt, maxLineLength)
}

const breakInMiddleOfWord = (text, maxLineLength) => {
  const head = text.substring(0, maxLineLength - 1)
  const tail = text.substring(maxLineLength - 1)
  return head + '-\n' + wrap(tail, maxLineLength)
}

const breakAtSpace = (text, spaceToBreakAt, maxLineLength) => {
  const head = text.substring(0, spaceToBreakAt)
  const tail = text.substring(spaceToBreakAt + 1)
  return head + '\n' + wrap(tail, maxLineLength)
}

module.exports = wrap
