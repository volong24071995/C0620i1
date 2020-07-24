/**
 * Created by nhatnk on 4/26/17.
 */
const Width = window.innerWidth;
const Hight = window.innerHeight;
console.log(Width)
console.log(Hight)

function Hero(image, top, left, size) {
  this.image = image;
  this.top = top;
  this.left = left;
  this.size = size;

  this.getHeroElement = function () {
    return '<img width="' + this.size + '"' +
      ' height="' + this.size + '"' +
      ' src="' + this.image + '"' +
      ' style="top: ' + this.top + 'px; left:' + this.left + 'px;position:absolute;" />';
  }

  this.moveRight = function () {
    this.left += 20;
  }
  this.moveTop = function () {
    this.top += 20;
  }
  this.moveLeft = function () {
    this.left -= 20;
  }
  this.moveBottom = function () {
    this.top -= 20;
  }
  this.settop=function(){
    this.top=top;
  }
  this.setleft=function(){
    this.left=left;
  }
}

var hero = new Hero('pikachu.png', 20, 20, 200);

function start() {
  if (hero.left < Width - hero.size && hero.top===20 ) {
    hero.moveRight();
  }
  if (hero.left >= Width - hero.size && hero.top < Hight - hero.size) {
    hero.moveTop();
  }
  if (hero.top >= Hight - hero.size && hero.left >= 20) {
    hero.moveLeft();
  }
  if (hero.left === 0 && hero.top >= 20) {
    hero.moveBottom();
  }

  /* dung 2
  if (hero.left < Width - hero.size && hero.top < Hight - hero.size && hero.left > 0) {
    hero.moveRight();
  }
  if (hero.left >= Width - hero.size && hero.top < Hight - hero.size) {
    hero.moveTop();
  }
  if (hero.top >= Hight - hero.size && hero.left >= 20) {
    hero.moveLeft();
  }
  if (hero.left === 0 && hero.top >= 0) {
    hero.moveBottom();
  }
  while (hero.top === 0) {
    hero.settop(20);
    hero.setleft(20)
  }
  */
  document.getElementById('game').innerHTML = hero.getHeroElement();
  setTimeout(start, 10);
}
start();