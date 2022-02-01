import React from "react";
import ReactDOM from "react-dom";

// 注意:
// 单大括号中可以使用任意的js表达式
// JSX也是js表达式
// object不能出现在{}内,会报错, object一般只出现在style属性中
// 不能再{}中写语句 如for / if

const name = "jack",
      age = 18;
const pet = {
  kind: "dog"
}
function sayHi() {
  return "hi~~";
}

const exp = (
  <h1>我是一个exp</h1>
)
const content = (
  <div>
    <h1>我叫{name},我今年{age}岁</h1>
    <h2>{pet.kind}</h2>
    <span>这是span</span>
    <p>{1}</p>
    <p>{'a'}</p>
    <p>{1+6}</p>
    <p>{1 < 2 ? "1小于2" : "1大于2"}</p>
    <p>{1 < 2 ? "1小于2" : "1大于2"}</p>
    <p>{sayHi()}</p>
    <p>{exp}</p>
  </div>
);

ReactDOM.render(content, document.getElementById("root"));

