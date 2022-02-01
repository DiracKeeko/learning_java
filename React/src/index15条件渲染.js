import React from "react";
import ReactDOM from "react-dom";

const isLoading = false;
function loadingData() {
  if (isLoading) {
    return <div>loading...</div>;
  }
  return <div>加载完成</div>
}

const content = (
  <div>
    { loadingData() }
  </div>
);


ReactDOM.render(content, document.getElementById("root"));

