let myChart = document.getElementById('resultsChart').getContext('2d');

Chart.defaults.global.defaultFontFamily = 'Lato';
Chart.defaults.global.defaultFontSize = 12;
Chart.defaults.global.defaultFontColor = '#777';


let massPopChart = new Chart(myChart, {
    type:'line', //bar, horizontalBar, line, doughnut, radar, polar Area
    data: {
        labels:['1h', '2h', '3h', '4h', '5h', '6h'],
        datasets:[{
            label:'Experiment 1',
            data:[
                DATASET
            ],
            //backgroundColor = 'green'
            borderColor:[
                'rgba(255, 99, 50, 0.6)'
            ],
            borderWidth:1,
            borderPointColor:'#777',
            hoverBorderWidth:2,
            pointHoverBorderColor:'#444',
            spanGaps:true,
            lineTension: 0,
            fill: false
        },
            {
                label:'Experiment 2',
                data:[
                    DATASET
                ],
                borderColor:[
                    'rgba(54, 209, 99, 0.6)'
                ],
                borderWidth:1,
                borderPointColor:'#777',
                hoverBorderWidth:2,
                pointHoverBorderColor:'#444',
                spanGaps:true,
                lineTension: 0,
                fill: false
            }
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