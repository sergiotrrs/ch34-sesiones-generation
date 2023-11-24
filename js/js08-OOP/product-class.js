/* Crear la clase producto. Atributos enncapsulados, Crear Setters y Getters
   * Utilizar la herencia.
        "id": 2,
        "title": "Mens Casual rts ",
        "price": 22.3,
        "description": "Slies a three-button placket.",
        "category": "men's clothing",
        "image": "https://fakestoreap.jpg",
        "rating": {
            "rate": 4.1,
            "count": 259
        }
*/
class Producto {
    #id; // readable, not modifiable
    #object; // readable, not modifiable
    #price; // readable & modifiable
    #description; // readable & modifiable
    #category; // readable & modifiable
    #image; // readable, not modifiable
  
    constructor(id, object, price, description, category, image) {
      this.#id = id;
      this.#object = object;
      this.#price = price;
      this.#description = description;
      this.#category = category;
      this.#image = image;
    }
  
    get id() {
      return this.#id;
    }
  
    get object() {
      return this.#object;
    }
  
    get price() {
      return this.#price;
    }
  
    set price(newPrice) {
      this.#price = newPrice;
    }
  
    get description() {
      return this.#description;
    }
  
    set description(newDescription) {
      this.#description = newDescription;
    }
  
    get category() {
      return this.#category;
    }
  
    set category(newCategory) {
      this.#category = newCategory
    }
  
    get image() {
      return this.#image;
    }
  
  }
  
  /**
   * #size; // readable, not modifiable
   */
  class Top extends Producto {
  
    #size; // readable, not modifiable
  
    constructor(id, object, price, description, category, image, size) {
      super(id, object, price, description, category, image);
  
      this.#size = size;
    }
  
    get size() {
      return this.#size;
    }
  
  }

  export { Producto, Top };