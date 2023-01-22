import React from "react";
import { BiSearchAlt } from "react-icons/bi";

export default function Searchbar() {
    return (
        <div className="bg-white border-none grid grid-flow-col rounded-xl mx-3">
            <BiSearchAlt className="text-gray-800 w-10 h-10 object-fill" />
            <div className="flex flex-row justify-center items-center content-center">
                <input type="text" name="search" placeholder="Search"
                    className="text-gray-500 outline-none border-none box-border w-full" />
            </div>
        </div>
    )
}