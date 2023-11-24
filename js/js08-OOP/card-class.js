
class Card {
    #image;
    #title;
    #description;
    constructor(image, title, description){
        this.image = image;
        this.#title = title;
        this.#description = description;        
    }

    set image( image ){
        this.#image = image;
    }
    get image(){
        return this.#image;
    }
    set title( title ){
        this.#title = title;
    }
    get title(){
        return this.#title;
    }
    set description( description ){
        this.#description = description;
    }
    get description(){
        return this.#description;
    }

    basicCard(){
        return `
      <article class="col-sm-6 col-lg-3" >
        <div class="card mx-auto mb-2" style="min-height: 20rem;">
         <img src="${ this.#image }" class="card-img-top" alt="..." >         
         <div class="card-body">
           <h5 class="card-title">${ this.#title  }</h5>
           <p class="card-text"> ${ this.#description  }</p>
           <a href="#" class="btn btn-success">Go somewhere</a>
         </div>
        </div>          
      </article>
   ` 
    }

    cardTitle(){
       return `
        <article class="col-sm-4 col-lg-2" >
            <div class="card" >
                <div class="card-body">
                    <h5 class="card-title">${this.#title}</h5>
                    <h6 class="card-subtitle mb-2 text-body-secondary">Card subtitle</h6>
                    <p class="card-text"> ${this.#description}</p>
                    <a href="#" class="card-link">Card link</a>
                </div>
            </div>
        </article>
        `
    }    

}

const numCohorte = 34;
// exportar las clases, funciones, variables, etc.
export { Card, numCohorte }; 