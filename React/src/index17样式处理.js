import React from "react";
import ReactDOM from "react-dom";
import "./index.css";

const songs = [
  { id: 1, name: " 痴心绝对" },
  { id: 2, name: "像我这样的人" },
  { id: 3, name: "南山南" },
];

const styleObj = {
  color: "#00D",
  font: "18px"
}
const list = (
  <div>
    <h1 className="title">歌单</h1>
    <ul>
      { songs.map( (s) => <li key={s.id} style={styleObj}>歌名:{s.name} id: {s.id}</li>) }
    </ul>
  </div>
);

// const content = (
//   <div>
//     {songs.map((s) => (
//       <div>
//         歌名:{s.id} id: {s.id}
//       </div>
//     ))}
//   </div>
// );

ReactDOM.render(list, document.getElementById("root"));
