class Latte {
    constructor() {
        this.name = 'latte'
    }
}

class Espresso {
    constructor() {
        this.name = 'espresso'
    }
}

class LatteFactory {
    static createCoffee() {
        return new Latte()
    }
}
class EspressoFactory {
    static createCoffe(){
        return new Espresso
    }
}

const factoryList = { LatteFactory, EspressoFactory }

class CoffeFactory{
    static createCoffe(type){
        const factory = factoryList[type]
        return factory.createCoffe()
    }
}

const main = () => {
    // 라떼 커피를 주문한다.
    const coffe = CoffeeFactory.createCoffee("LatteFactory")
    // 커피 이름을 부른다. 
}