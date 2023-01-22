import React from 'react';
import { useState, useEffect } from 'react';

function Clock(){
    const [date, setDate] = useState(new Date());
    function refreshClock(){
        setDate(new Date());
    }
    
    useEffect(() => {
        const timerId = setInterval(refreshClock, 1000);
        return function cleanup() {
            clearInterval(timerId);
        };
    }, []);
    return (
        <span>
            {date.toLocaleTimeString()}
        </span>
    );
}

export default Clock;

// const clock-component = () => {
//     let time = new Date().toLocaleTimeString();
//     const [currentTime, setCurrentTime] = useState(time);

//     const updateTime = () => {
//         let time = new Date().toLocaleTimeString();
//         setCurrentTime(time);
//     }

//     setInterval(updateTime, 1000)
    
//     return (
//     <div>
//         <h1>{currentTime}</h1>
//     </div>
//   )
// }

// export default clock-component
