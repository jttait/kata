const wrap = require('./wrap')

test('should return original string if it fits on one line', () => {
  expect(wrap('test', 10)).toBe('test')
})

test('should return original string if two words fit on one line', () => {
  expect(wrap('test word', 10)).toBe('test word')
})

test('should break between words if both do not fit on one line', () => {
  expect(wrap('test word', 5)).toBe('test\nword')
})

test('should break between three words if no two fit on one line', () => {
  expect(wrap('test word bat', 5)).toBe('test\nword\nbat')
})

test('should only break where needed', () => {
  expect(wrap('test word bat', 10)).toBe('test word\nbat')
})

test('should break in middle of word if does not fit on single line', () => {
  expect(wrap('hello', 4)).toBe('hel-\nlo')
})

test('should break in middle of word if does not fit on single line', () => {
  expect(wrap('antidisestablishmentarianism', 5)).toBe('anti-\ndise-\nstab-\nlish-\nment-\naria-\nnism')
})

test('should return empty string if empty string provided', () => {
  expect(wrap('', 10)).toBe('')
})

test('should break in middle of word only when needed', () => {
   expect(wrap('cat rabbit', 4)).toBe('cat\nrab-\nbit')
})
