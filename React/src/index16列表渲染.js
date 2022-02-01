import React from "react";
import ReactDOM from "react-dom";

const songs = [
  { id: 1, name: " 痴心绝对" },
  { id: 2, name: "像我这样的人" },
  { id: 3, name: "南山南" },
];

const list = (
  <ul>
    { songs.map( (s) => <li key={s.id}>歌名:{s.name} id: {s.id}</li>) }
  </ul>
);

// const content = (
//   <div>
//     {songs.map((s) => (
//       <div>
//         歌名:{s.name} id: {s.id}
//       </div>
//     ))}
//   </div>
// );

ReactDOM.render(list, document.getElementById("root"));
