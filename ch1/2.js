class Singleton{
    constructor(){
        if (!Singleton.instance){
            Singleton.instance = this
        }
        return Singleton.instance
    }

    getInstance(){
        return this.instance
    }
}
const a = new Singleton()
const b = new Singleton()
console.log(a)
console.log(a.getInstance)
console.log(a.constructor())

console.log(a===b)
