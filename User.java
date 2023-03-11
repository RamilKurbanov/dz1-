class User {
    constructor(login, password, basket) {
      this.login = login;
      this.password = password;
      this.basket = basket;
      const users = {
  new User("John", "123456", new Basket(products)),
  new User("Bob", "123456", new Basket(products)),
  new User("Alice", "123456", new Basket(products))
      };
    }
  }