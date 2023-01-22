import React from 'react'
import * as Falcons from 'react-icons/fa'
import * as AiIcons from 'react-icons/ai'
import * as IoIcons from 'react-icons/io'
import * as RiIcons from 'react-icons/ri'

export const SidebarData = [
    {
        title: 'Overview',
        path: '/overview',
        icon: <AiIcons.AiFillHome/>,
        iconClosed: <RiIcons.RiArroDownSFill/>,
        iconOpened: <RiIcons.RiArrowUpSFill/>,
        subNav:[
        {
            title: 'Users',
            path: '/overview/users',
            icon: <IoIcons.IoIosPaper/>,
        },
        {
            title: 'Revenue',
            path: '/overview/revenue',
            icon: <IoIcons.IoIosPaper/>,
        },

        ]

    },
    {
        title: 'Reports',
        path: '/reports',
        icon: <AiIcons.AiFillHome/>,
        iconClosed: <RiIcons.RiArroDownSFill/>,
        iconOpened: <RiIcons.RiArrowUpSFill/>,
        subNav:[
        {
            title: 'Reports',
            path: '/reports/reports1',
            icon: <IoIcons.IoIosPaper/>,
        },
        {
            title: 'Reports 2',
            path: '/reports/reports1',
            icon: <IoIcons.IoIosPaper/>,
        },
        {
            title: 'Reports 3',
            path: '/reports/reports1',
            icon: <IoIcons.IoIosPaper/>,
        },

        ]

    },
    {
        title:'Products',
        path:'/products',
        icon:<FaIcons.FaCartPlus/>
    }
   

]