<template>
  <div id="app">
    <h2>Vue.js WebSocket Tutorial</h2>
    <button v-on:click="sendMessage('hello')">Send Message</button>
  </div>
</template>

<script>

export default {
  name: 'App',
  data: function ()
  {
    return {
      connection: null
    }
  },
  created() {
    console.log("Starting your new Websocket connection")
    this.connection = new WebSocket("wss://echo.websocket.org")

    this.connection.onmessage = function (event) {
      console.log(event)
    }

    this.connection.onopen = function (event) {
      console.log(event)
      console.log("Opened websocket with succes")
    }
  },
  methods: {
    sendMessage: function(message) {
      console.log(this.connection)
      this.connection.send(message)
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
