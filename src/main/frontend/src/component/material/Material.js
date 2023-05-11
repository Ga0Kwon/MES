import React,{ useState , useEffect } from 'react';
import axios from 'axios';
/* ---------table mui -------- */
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';
import Pagination from '@mui/material/Pagination';
/* ---------------------------*/
import Container from '@mui/material/Container';
import Button from '@mui/material/Button';
import MaterialCreate from "./MaterialCreate";
import MaterialView from "./MaterialView"

export default function Material() {
  return (<>

    <div>
      <h2>자재</h2>
    </div>
    <div>
        <h3>자재 현황</h3>
        <MaterialView />
    </div>


    <div>
        <MaterialCreate />

    </div>

  </>);
}