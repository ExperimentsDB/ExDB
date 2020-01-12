package website;

public class webResultsChartTemplate extends webHtml {
    //Graph template for results
    public webResultsChartTemplate() {
        html = "let myChart1 = document.getElementById('myChart1').getContext('2d');\n" +
                "\n" +
                "Chart.defaults.global.defaultFontFamily = 'Lato';\n" +
                "Chart.defaults.global.defaultFontSize = 12;\n" +
                "Chart.defaults.global.defaultFontColor = '#777';\n" +
                "\n" +
                "\n" +
                "let resultsunit1 = new Chart(myChart1, {\n" +
                "    type:'line', //bar, horizontalBar, line, doughnut, radar, polar Area\n" +
                "    data: {\n" +
                "        datasets:[\n" +
                "            DATASETS\n" +
                "        ]\n" +
                "    },\n" +
                "    options:{\n" +
                "       scales: {\n" +
                "            xAxes: [{\n" +
                "                scaleLabel: {\n" +
                "                    display: true,\n" +
                "                    labelString: \"Time (h)\",\n" +
                "                },\n" +
                "                type: 'linear',\n" +
                "                position: 'bottom'\n" +
                "            }],\n" +
                "            yAxes: [{\n" +
                "                scaleLabel: {\n" +
                "                    display: true,\n" +
                "                    labelString: \"Measurements (m)\"\n" +
                "                },\n" +
                "                type: 'linear'\n" +
                "            }]\n" +
                "        },\n" +
                "        title:{\n" +
                "            display: true,\n" +
                "            text: 'Experimental Results',\n" +
                "            fontSize: 25\n" +
                "        },\n" +
                "        legend: {\n" +
                "            display:false,\n" +
                "            position:'right',\n" +
                "            labels: {\n" +
                "                fontColor:'#000'\n" +
                "            }\n" +
                "        },\n" +
                "        layout:{\n" +
                "            padding:{\n" +
                "                left:0,\n" +
                "                right:0,\n" +
                "                bottom:0,\n" +
                "                top:0\n" +
                "            }\n" +
                "        },\n" +
                "        tooltips:{\n" +
                "            enabled:true\n" +
                "        }\n" +
                "    }\n" +
                "});";
    }
}
