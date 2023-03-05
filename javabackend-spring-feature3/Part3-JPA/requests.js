// СОЗДАТЬ НАРУШЕНИЕ

fetch(
  '/api/v1/fines', 
  { 
    method: 'POST', 
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ 
      id: 1, // ID штрафа, генерируется автоматически при указании любого большего числа, чем последний в базе данных
      car: "Н465КУ", 
      violator: "Лях Глеб Владимирович", 
      officer: "Медведев Денис Михайлович", 
      date: "01.01.2022", 
      amount: "3000", 
      datepaid: "", 
      datetopay: "01.02.2022", 
      subpoena: Boolean(false), 
      paid: Boolean(false)
    })
  }
).then(result => result.json().then(console.log))

// ПОЛУЧИТЬ ВСЕ

fetch('/api/v1/fines').then(response => response.json().then(console.log))

// ОТПРАВИТЬ ПОВЕСТКУ

fetch('/api/v1/fines/1/court', { method: 'PATCH', })

// ПОМЕТИТЬ ШТРАФ КАК ОПЛАЧЕННЫЙ

fetch('/api/v1/fines/1/pay', { method: 'PATCH', })

// ОБНОВИТЬ ШТРАФ

fetch(
  '/api/v1/fines', 
  { 
    method: 'POST', 
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ 
      id: 1, 
      car: "Н465КУ", 
      violator: "Лях Глеб Владимирович", 
      officer: "Медведев Денис Михайлович", 
      date: "01.01.2022", 
      amount: "3000", 
      datepaid: "15.01.2022", 
      datetopay: "01.02.2022", 
      subpoena: Boolean(true), 
      paid: Boolean(true)
    })
  }
).then(result => result.json().then(console.log))

// УДАЛИТЬ ШТРАФ

fetch(
  '/api/v1/fines', 
  { 
    method: 'DELETE', 
    headers: { 'Content-Type': 'application/json' }, 
    body: JSON.stringify(4) // ID штрафа
  }
)

// АДРЕСА, доступные для получения данных, пагинации, сортировк и фильтрации
// /api/v1/fines -- получить все штрафы
// /api/v1/fines/1 -- получить штраф с ID 1
// /api/v1/fines/0/3 -- получить 3 штрафа на странице 0
// /api/v1/fines/0/3/amount -- получить 3 штрафа на странице 0, отсортированные по сумме
// /api/v1/fines/0/3/violator -- получить 3 штрафа на странице 0, отсортированные по фамилии нарушителя
// /api/v1/fines/0/3/issubpoena -- получить 3 штрафа на странице 0, отсортированные по наличию повестки
// /api/v1/fines/1/court -- отправить повестку на штраф с ID 1
// /api/v1/fines/1/pay -- пометить штраф с ID 1 как оплаченный
