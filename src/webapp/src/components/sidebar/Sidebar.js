import React from "react";
import "./Sidebar.css";
import { AiTwotoneBank } from "react-icons/ai";

export default function Sidebar() {
    return (
        <nav className="sidebar bg-neutral-900">
            <AiTwotoneBank className="logo" />
            <h1 className="text-gray-200 text-xl">Timer</h1>
            <h1 className="text-gray-200 text-xl" >Stock Market</h1>
        </nav>
    )
}