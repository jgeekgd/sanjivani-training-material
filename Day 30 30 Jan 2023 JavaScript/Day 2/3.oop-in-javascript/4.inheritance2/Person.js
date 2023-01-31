export default class Person {
  name;
  constructor(name) {
    this.name = name;
  }
  introduceSelf() {
    return (`Hi! I'm ${this.name}`);
  }
}
