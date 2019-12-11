let myChart = document.getElementById('resultsChart').getContext('2d');

Chart.defaults.global.defaultFontFamily = 'Lato';
Chart.defaults.global.defaultFontSize = 12;
Chart.defaults.global.defaultFontColor = '#777';


let massPopChart = new Chart(myChart, {
    type:'line', //bar, horizontalBar, line, doughnut, radar, polar Area
    data: {
        labels:[ TIMELABELS ],
        datasets:[ DATASETS ]
    },
    options:{
        title:{
            display: true,
            text: 'Line Chart of Results',
            fontSize: 25
        },
        legend: {
            display:false,
            position:'right',
            labels: {
                fontColor:'#000'
            }
        },
        layout:{
            padding:{
                left:0,
                right:0,
                bottom:0,
                top:0
            }
        },
        tooltips:{
            enabled:true
        }
    }
});