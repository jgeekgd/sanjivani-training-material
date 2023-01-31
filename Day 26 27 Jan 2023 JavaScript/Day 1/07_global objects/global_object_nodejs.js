function gd() {
  console.log(this);
}
gd();

/* 
{
  <ref *1> Object [global] {
  global: [Circular *1],
  clearInterval: [Function: clearInterval],
  clearTimeout: [Function: clearTimeout],
  setInterval: [Function: setInterval],
  setTimeout: [Function: setTimeout] {
    [Symbol(nodejs.util.promisify.custom)]: [Getter]
  },
  queueMicrotask: [Function: queueMicrotask],
  performance: Performance {
    nodeTiming: PerformanceNodeTiming {
      name: 'node',
      entryType: 'node',
      startTime: 0,
      duration: 41.78810000419617,
      nodeStart: 0.43459999561309814,
      v8Start: 1.6611000299453735,
      bootstrapComplete: 29.183300018310547,
      environment: 18.760500073432922,
      loopStart: -1,
      loopExit: -1,
      idleTime: 0
    },
    timeOrigin: 1674804016791.296
  },
  clearImmediate: [Function: clearImmediate],
  setImmediate: [Function: setImmediate] {
    [Symbol(nodejs.util.promisify.custom)]: [Getter]
  }
} 
}*/
