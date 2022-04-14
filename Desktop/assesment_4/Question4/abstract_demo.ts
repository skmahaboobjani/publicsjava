export abstract class Animal {
    
    constructor(public name:string){


    }

    abstract talk(): string;

    public getName():string
    {
    return this.name;

    }
    
   }
