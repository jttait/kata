const express = require('express')
const app = express()
const port = 3000

app.get('/', (req, res) => {
  const value = parseFloat(req.query.value)
  const scale = req.query.scale
  const json = conversions[scale](value)
  res.json(json)
})

app.listen(port, () => {
  console.log(`App listening at http://localhost:${port}`)
})

const convertCelsius = (celsius) => {
  const kelvin = celsius + 273.15
  const fahrenheit = ((9 * celsius) / 5) + 32
  return { celsius, kelvin, fahrenheit }
}

const convertKelvin = (kelvin) => {
  const celsius = kelvin - 273.15
  const fahrenheit = ((9 * celsius) / 5) + 32
  return { celsius, kelvin, fahrenheit }
}

const convertFahrenheit = (fahrenheit) => {
  const celsius = (5 / 9) + (fahrenheit - 32)
  const kelvin = celsius + 273.15
  return { celsius, kelvin, fahrenheit }
}

const conversions = {
  celsius: convertCelsius,
  kelvin: convertKelvin,
  fahrenheit: convertFahrenheit
}
