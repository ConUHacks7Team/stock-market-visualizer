import React from "react";
import Searchbar from "./Searchbar";
import SearchResult from "./SearchResult";
import { AiTwotoneBank } from "react-icons/ai";

export default function Sidebar() {
    return (
        <nav className="bg-neutral-900 col-span-2">
            <div className="flex flex-row items-center justify-around">
                <AiTwotoneBank className="text-gray-50 w-40 h-20 object-fill" />
                <h6 className="text-gray-200 text-3xl" >Stock Market Visualization</h6>
            </div>
            <Searchbar className="py-10"/>
            <SearchResult />
        </nav>
    )
}