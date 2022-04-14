import { Animal } from "./abstract_demo";

export class Lion extends Animal{
    constructor(name:string){
        super(name);
    }

     talk(): string{
    return "Lion is louding";
    }
}

export class Tiger extends Animal{
    constructor(name:string){
        super(name);
    }

     talk(): string{
    return "Tiger is louding";
    }
}
