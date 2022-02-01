import React from "react";
import ReactDOM from "react-dom";

/* 
  JSX特殊约定
  1.标签上加class要用className 而不是class
    <h1 className="class-title">hello react use jsx</h1>
  2.原生的for 要换成htmlFor 
    <label htmlFor="id"></label>
*/
const title = (
  <div>
    <h1 className="class-title">hello react use jsx</h1>
    <span>这是span</span>
  </div>
)

ReactDOM.render(title, document.getElementById("root"));