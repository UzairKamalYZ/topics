const themes = {
    default: {
        primary: "#931648",
        primaryDark: "#7d133d",
        primaryLight: "#C6497B",
        secondary: "#231D45",
        backgroundHeader: "#c4c4c400",
        backgroundFooter: "#c4c4c400",
        fontStack: "'Open Sans', sans-serif",
        customFont: "Open Sans"
    },
    isabel: {
        primary: "#931648",
        primaryDark: "#7d133d",
        primaryLight: "#C6497B",
        secondary: "#231D45",
        backgroundHeader: "#c4c4c400",
        backgroundFooter: "#c4c4c400",
        fontStack: "Rubrik, MS Sans Serif, Geneva, sans-serif",
        customFont: "Rubrik",
        customCSS: `
      table {
        position: relative;
        width: 100%;
        min-width:570px;
        border-collapse: collapse;
        font-size: 0.8rem;
        margin-bottom:10px;
      }

      table.totals{
        width:50%;
        float:right;
      } 
                 
      table.totals > thead > tr > th:nth-child(1),table.totals > thead > tr > th:nth-child(2),
      table.totals > tbody > tr > td:nth-child(1),table.totals > tbody > tr > td:nth-child(2){
        text-align: right;
      }
      
      table.totals > tbody > tr:last-child{
        border-bottom:  1px solid #dad7d5;
      }

      table.totals > tbody > tr:last-child td.info{
        text-align: left;
        padding-bottom:30px;
      }

      table.totals:nth-child(2){
        margin-top:-10px;
      }

      table.totals:nth-child(2) > tbody > tr > td{
        border-color: transparent;
      }
      
     table.totals-info{
        float:right;
        text-align: right;
        border-color: transparent;
        width:50%
        margin-left: 10px;
      }

      table.totals-info > tbody > tr > td:nth-child(1),table.totals-info > tbody > tr > td:nth-child(2){
        text-align: left;
        border: 0px;
      }
      
      table tbody tr:nth-child(odd){ 
        background-color: #ffffff;
      }
    
      table tbody tr:nth-child(even){ 
        background-color: #f2f2f2;
      }
    
      table thead tr th:nth-child(1), 
      table tbody tr td:nth-child(1),
      table thead tr th:nth-child(2), 
      table tbody tr td:nth-child(2){
        text-align:left;
      }
    
      table thead tr th:nth-child(3),
      table tbody tr td:nth-child(3),
      table thead tr th:nth-child(4),
      table tbody tr td:nth-child(4),
      table thead tr th:nth-child(5),
      table tbody tr td:nth-child(5){
        text-align:right;
      }
    
      @media (max-width: 675px){
        table thead tr th:nth-child(1),
        table tbody tr td:nth-child(1){ width:50%; }
        table thead tr th:nth-child(2),
        table tbody tr td:nth-child(2){ width:6%; }
        table thead tr th:nth-child(3),
        table tbody tr td:nth-child(3){ width:24%; }
        table thead tr th:nth-child(4),
        table tbody tr td:nth-child(4){ width:20%; }
      }
    
      @media (max-width: 360px){
        table thead tr th:nth-child(1),
        table tbody tr td:nth-child(1){ width:48%; }
        table thead tr th:nth-child(2),
        table tbody tr td:nth-child(2){ width:8%; }
        table thead tr th:nth-child(3),
        table tbody tr td:nth-child(3){ width:24%; }
        table thead tr th:nth-child(4),
        table tbody tr td:nth-child(4){ width:20%; }
      }
    
      th,td {
        padding: 0.5rem;
        vertical-align:top;
      }
    
      th {
        vertical-align:bottom;
        padding-bottom:1px;
        padding-top:0px;
      }
    
      td {
        border-top: 1px solid #dad7d5;
      }

      @media (max-width: 770px){
        table.totals{
          width:100%;
        }  
      }    
    `
    },
    bnp: {
        primary: "#429464",
        primaryDark: "#0e3403",
        primaryLight: "#b4cfac",
        secondary: "#231D45",
        backgroundHeader: "#fff",
        backgroundFooter: "#fff",
        //headerLogo: require("./images/bnp-logo.svg"),
        fontStack: "Rubrik, MS Sans Serif, Geneva, sans-serif",
        customFont: "Rubrik",
        customCSS: `
      table {
        position: relative;
        width: 100%;
        min-width:570px;
        border-collapse: collapse;
        font-size: 0.8rem;
        margin-bottom:10px;
      }

      table tbody tr:nth-child(odd){ 
        background-color: #ffffff;
      }
    
      table tbody tr:nth-child(even){ 
        background-color: #f2f2f2;
      }
    
      table thead tr th:nth-child(1), 
      table tbody tr td:nth-child(1),
      table thead tr th:nth-child(2), 
      table tbody tr td:nth-child(2){
        text-align:left;
      }
    
      table thead tr th:nth-child(3),
      table tbody tr td:nth-child(3),
      table thead tr th:nth-child(4),
      table tbody tr td:nth-child(4),
      table thead tr th:nth-child(5),
      table tbody tr td:nth-child(5){
        text-align:right;
      }
    
      @media (max-width: 675px){
        table thead tr th:nth-child(1),
        table tbody tr td:nth-child(1){ width:50%; }
        table thead tr th:nth-child(2),
        table tbody tr td:nth-child(2){ width:6%; }
        table thead tr th:nth-child(3),
        table tbody tr td:nth-child(3){ width:24%; }
        table thead tr th:nth-child(4),
        table tbody tr td:nth-child(4){ width:20%; }
      }
    
      @media (max-width: 360px){
        table thead tr th:nth-child(1),
        table tbody tr td:nth-child(1){ width:48%; }
        table thead tr th:nth-child(2),
        table tbody tr td:nth-child(2){ width:8%; }
        table thead tr th:nth-child(3),
        table tbody tr td:nth-child(3){ width:24%; }
        table thead tr th:nth-child(4),
        table tbody tr td:nth-child(4){ width:20%; }
      }
    
      th,td {
        padding: 0.5rem;
        vertical-align:top;
      }
    
      th {
        vertical-align:bottom;
        padding-bottom:1px;
        padding-top:0px;
      }
    
      td {
        border-top: 1px solid #dad7d5;
      }    
    `
    },
    multiline: {
        primary: "#57719f",
        primaryDark: "#506892",
        primaryLight: "#627ba9",
        secondary: "#57719f",
        backgroundHeader: "#c4c4c400",
        backgroundFooter: "#c4c4c400",
        fontStack: "Rubrik, MS Sans Serif, Geneva, sans-serif",
        customFont: "Rubrik",
        customCSS: `
      table {
        position: relative;
        width: 100%;
        min-width:570px;
        border-collapse: collapse;
        font-size: 0.8rem;
        margin-bottom:10px;
      }

      table.totals{
        width:50%;
        float:right;
      }

      table.totals > thead > tr > th:nth-child(1),table.totals > thead > tr > th:nth-child(2),
      table.totals > tbody > tr > td:nth-child(1),table.totals > tbody > tr > td:nth-child(2){
        text-align: right;
      }

      table.totals > tbody > tr:last-child{
        border-bottom:  1px solid #dad7d5;
      }
      
      table.totals > tbody > tr:last-child td.info{
        text-align: left;
        padding-bottom:30px;
      }

      table.totals:nth-child(2){
        margin-top:-10px;
      }

      table.totals:nth-child(2) > tbody > tr > td{
        border-color: transparent;
      }
      
      table.totals-info{
        float:right;
        text-align: right;
        border-color: transparent;
        width:50%
        margin-left: 10px;
      }

      table.totals-info > tbody > tr > td:nth-child(1),table.totals-info > tbody > tr > td:nth-child(2){
        text-align: left;
        border: 0px;
      }

      table tbody tr:nth-child(odd){ 
        background-color: #ffffff;
      }
    
      table tbody tr:nth-child(even){ 
        background-color: #f2f2f2;
      }
    
      table thead tr th:nth-child(1), 
      table tbody tr td:nth-child(1),
      table thead tr th:nth-child(2), 
      table tbody tr td:nth-child(2){
        text-align:left;
      }
    
      table thead tr th:nth-child(3),
      table tbody tr td:nth-child(3),
      table thead tr th:nth-child(4),
      table tbody tr td:nth-child(4),
      table thead tr th:nth-child(5),
      table tbody tr td:nth-child(5){
        text-align:right;
      }
    
      @media (max-width: 675px){
        table thead tr th:nth-child(1),
        table tbody tr td:nth-child(1){ width:50%; }
        table thead tr th:nth-child(2),
        table tbody tr td:nth-child(2){ width:6%; }
        table thead tr th:nth-child(3),
        table tbody tr td:nth-child(3){ width:24%; }
        table thead tr th:nth-child(4),
        table tbody tr td:nth-child(4){ width:20%; }
      }
    
      @media (max-width: 360px){
        table thead tr th:nth-child(1),
        table tbody tr td:nth-child(1){ width:48%; }
        table thead tr th:nth-child(2),
        table tbody tr td:nth-child(2){ width:8%; }
        table thead tr th:nth-child(3),
        table tbody tr td:nth-child(3){ width:24%; }
        table thead tr th:nth-child(4),
        table tbody tr td:nth-child(4){ width:20%; }
      }
    
      th,td {
        padding: 0.5rem;
        vertical-align:top;
      }
    
      th {
        vertical-align:bottom;
        padding-bottom:1px;
        padding-top:0px;
      }
    
      td {
        border-top: 1px solid #dad7d5;
      }

      @media (max-width: 770px){
        table.totals{
          width:100%;
        }  
      }    
    `
    },
    kbc: {
        primary: "#931648",
        primaryDark: "#7d133d",
        primaryLight: "#C6497B",
        secondary: "#231D45",
        backgroundHeader: "#c4c4c400",
        backgroundFooter: "#c4c4c400",
        fontStack: "'Open Sans', sans-serif",
        customFont: "Open Sans",
        customCSS: `
      table {
        position: relative;
        width: 100%;
        min-width:570px;
        border-collapse: collapse;
        font-size: 0.8rem;
        margin-bottom:10px;
        text-align:left;
      }
    
      table, table th, table td {
        border: 1px solid #dad7d5;
        white-space: nowrap;
      }
    
      table tbody tr:nth-child(odd){ 
        background-color: #ffffff;
      }
    
      table tbody tr:nth-child(even){ 
        background-color: #f2f2f2;
      }
    
      th,td {
        padding: 0.5rem;
        vertical-align:top;
      }
    
      th {
        vertical-align:bottom;
        padding-bottom:1px;
        padding-top:0px;
      }
    
      td {
        border-top: 1px solid #dad7d5;
      }
    `
    },
    bigbank: {
        primary: "#ffcc00",
        primaryDark: "#ff8800",
        primaryLight: "#ffff00",
        secondary: "#ffcc00",
        backgroundHeader: "#c4c4c400",
        backgroundFooter: "#c4c4c400",
        fontStack: "Rubrik, MS Sans Serif, Geneva, sans-serif",
        customFont: "Rubrik",
        customCSS: `
      .totals {
        width: 50%;
        margin-left: 50%;
        border-collapse: collapse;
        font-size: 0.8rem;
        margin-bottom:10px;
        border: solid 2px black;
      }

      .details {
        position: relative;
        width: 100%;
        min-width:570px;
        border-collapse: collapse;
        font-size: 0.8rem;
        margin-bottom:10px;
      }

      .details tbody tr:nth-child(odd){ 
        background-color: #ffffff;
      }
    
      .details tbody tr:nth-child(even){ 
        background-color: #f2f2f2;
      }
    
      .details thead tr th:nth-child(1), 
      .details tbody tr td:nth-child(1),
      .details thead tr th:nth-child(2), 
      .details tbody tr td:nth-child(2){
        text-align:left;
      }
    
      .details thead tr th:nth-child(3),
      .details tbody tr td:nth-child(3),
      .details thead tr th:nth-child(4),
      .details tbody tr td:nth-child(4),
      .details thead tr th:nth-child(5),
      .details tbody tr td:nth-child(5){
        text-align:right;
      }
    
      @media (max-width: 675px){
        .details thead tr th:nth-child(1),
        .details tbody tr td:nth-child(1){ width:50%; }
        .details thead tr th:nth-child(2),
        .details tbody tr td:nth-child(2){ width:6%; }
        .details thead tr th:nth-child(3),
        .details tbody tr td:nth-child(3){ width:24%; }
        .details thead tr th:nth-child(4),
        .details tbody tr td:nth-child(4){ width:20%; }
      }
    
      @media (max-width: 360px){
        .details thead tr th:nth-child(1),
        .details tbody tr td:nth-child(1){ width:48%; }
        .details thead tr th:nth-child(2),
        .details tbody tr td:nth-child(2){ width:8%; }
        .details thead tr th:nth-child(3),
        .details tbody tr td:nth-child(3){ width:24%; }
        .details thead tr th:nth-child(4),
        .details tbody tr td:nth-child(4){ width:20%; }
      }
    
      th,td {
        padding: 0.5rem;
        vertical-align:top;
      }
    
      th {
        vertical-align:bottom;
        padding-bottom:1px;
        padding-top:0px;
      }
    
      td {
        border-top: 1px solid #dad7d5;
      }    
    `
    }
}

const mapping = window.themes ? window.themes : {}

export default function getTheme(theme) {
    if (!theme) {
        return themes.default
    }
    if (mapping[theme] && themes[mapping[theme]]) {
        return themes[mapping[theme]]
    }
    if (themes[theme]) {
        return themes[theme]
    }
    return themes.default
}