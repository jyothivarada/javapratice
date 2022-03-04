
const doSomethingAsync = () => {
   return new Promise(resolve => {
      setTimeout(() => resolve('I did something'), 3000)
   })
}

//doSomethingAsync().then(e => console.log(e))

const doSomething = async () => {
   //calls api service
   console.log(await doSomethingAsync())
}

doSomething();
