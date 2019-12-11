let myChart1 = document.getElementById('myChart1').getContext('2d');

Chart.defaults.global.defaultFontFamily = 'Lato';
Chart.defaults.global.defaultFontSize = 12;
Chart.defaults.global.defaultFontColor = '#777';


let resultsunit1 = new Chart(myChart1, {
    type:'line', //bar, horizontalBar, line, doughnut, radar, polar Area
    data: {
        labels:['1h', '2h', '3h', '4h', '5h', '6h'],
        datasets:[
            DATASETS
        ]
    },
    options:{
        title:{
            display: true,
            text: 'Testing multiple lines',
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