<template>
  <!--
    <div class="card bg-light mb-3 centerDiv" style="max-width: 18rem;">
      <div class="card-header">Location Title + area + timezone </div>
      <div class="card-body">
        <h5 class="card-title">Location name </h5>
        <img class="storyImg" src="https://romanrobroek.nl/wp-content/uploads/2016/12/livingrooms_15.jpg">
        <p class="card-text storyTxt">Story for the location</p>
        <ul>
          <liL><a href="#"> Choice 1</a></liL>
          <liL><a href="#"> Choice 2</a></liL>
          <liL><a href="#"> Choice 3</a></liL>
        </ul>
      </div>
    </div>
-->
  <div class="container">
    <div class="row">
      <div class="col-md-10 col-md-offset-1 centerDiv">
        <div class="card bg-light mb-3">
          <div class="card-header">
            <p>Location Title + area + timezone </p>
          </div>

          <div class="card-body">
            <img class="storyImg" src="https://romanrobroek.nl/wp-content/uploads/2016/12/livingrooms_15.jpg">
            <p class="storyTxt"> Story for the location</p>


            <nav class="choice">
              <li class="menuchoice"><a class="link" href="#">Choice 1</a></li>
              <li class="menuchoice"><a class="link" href="#">Choice 2</a></li>
              <li class="menuchoice"><a class="link" href="#">Choice 3</a></li>
            </nav>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div class="card bg-light mb-3 centerDiv container">
    <div class="card-header"><p>You`re inventory. Space left: 50</p></div>
    <div class="card-body">
      <nav class="invNav">
        <li class="inventory"> Item 1 Quantity 2</li>
      </nav>
    </div>
  </div>
</template>

<script>
export default {
  name: "LocationComponent"
}
</script>

<style scoped>
  .choice {
    list-style-type: none;
    margin: 0;
    padding: 0;
    display: block;
  }

  .menuchoice .link {
    display: inline-block;
    width: 40%;
  }


  .centerDiv {
    margin: 10% auto auto;
  }

  .storyImg {
    width: 38%;
    height: 38%;
    float: left;
    margin: 0 10px 10px 0;
  }

  .inventory {
    display: inline-block;
    width: 40%;
    color: #ff0000;
  }
  .storyTxt {
    padding: 5px;
  }
</style>