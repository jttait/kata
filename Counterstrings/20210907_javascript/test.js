const counterstring = require('./counterstring.js')

test('counterstring of 0', () => {
  expect(counterstring(0)).toBe('')
})

test('counterstring of 1', () => {
  expect(counterstring(1)).toBe('*')
})

test('counterstring of 2', () => {
  expect(counterstring(2)).toBe('*3')
})

test('counterstring of 3', () => {
  expect(counterstring(3)).toBe('*3*')
})

test('counterstring of 4', () => {
  expect(counterstring(4)).toBe('*3*5')
})

test('counterstring of 5', () => {
  expect(counterstring(5)).toBe('*3*5*')
})

test('counterstring of 6', () => {
  expect(counterstring(6)).toBe('*3*5*7')
})

test('counterstring of 10', () => {
  expect(counterstring(10)).toBe('*3*5*7*9*1')
})

test('counterstring of 20', () => {
  expect(counterstring(20)).toBe('*3*5*7*9*12*15*18*21')
})
