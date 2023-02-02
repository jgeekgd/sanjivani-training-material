var person1 = {
    fullName: function() {
      return this.firstName + " " + this.lastName;
    }
}

var person2 = {
    firstName:"John",
    lastName: "Wilson",
}

console.log("Hello, "+ person1.fullName('GD','abc'));
console.log("Hello, "+ person1.fullName.call(person2));


// The call() method calls a function with a given this value and arguments provided individually.
// call() method:
// 1. Accepts additional parameters as well
// 2. Executes the function it was called upon right away.
// 3. The call() method does not make a copy of the function it is being called on.
// 4. call() and apply() serve the exact same purpose. 
//  The only difference between how they work is that call() expects all parameters to be passed in individually, 
//  whereas apply() expects an array of all of our parameters.

var superHero = {
    firstname: 'Super',
    lastname: 'Man ',
    getSuperHeroFullName: function() {
        var fullname = this.firstname + ' ' + this.lastname;
        return fullname;
    }
};

var superHeroName = function(snack, hobby) {
    return (this.getSuperHeroFullName() + ' loves ' + snack + ' and ' + hobby);
};

console.log('call() invocation: '+superHeroName.call(superHero,'air', 'coding')); // Super Man  loves air and coding
console.log('apply() invocation: '+superHeroName.apply(superHero,['air', 'coding'])); // Super Man  loves air and coding

call(thisParameter)
call(thisParameter,arg1, agr2, arg3, argn)



// -----------------------------
// Code like boss

const animals = [
      { 
        species: 'Lion', 
        name: 'King' 
      },
      { 
        species: 'Whale', 
        name: 'Fail' 
      }
  ];
  
  for (let i = 0; i < animals.length; i++) {
    (function(i) {
      this.print = function() {
        console.log('#' + i + ' ' + this.species
                    + ': ' + this.name);
      }
      this.print();
    }).call(animals[i], i);
}


