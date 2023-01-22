import React from "react";
import { AiTwotoneBank } from "react-icons/ai";

export default function Sidebar() {
    return (
        <nav className="bg-neutral-900">
            <div className="flex flex-row">
                <AiTwotoneBank className="text-gray-50" />
                <h6 className="text-gray-200 text-xs">Time</h6>
                <h6 className="text-gray-200 text-xs" >Stock Market</h6>
            </div>
        </nav>


    )
}