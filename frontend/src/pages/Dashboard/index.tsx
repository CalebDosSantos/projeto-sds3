import NavBar from "components/NavBar";
import Footer from "components/Footer";
import DataTableJoe from "components/DataTable";
import BarChart from "components/BarChart";
import DonutChart from "components/DonutChart";

const Dashboard = () => {
  return (
    <div>
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3" >Dashboard de Vendas</h1>

          <div className="row px-3">
            <div className="col-sm-6">
              <h5 className="text-center text-secondary">Taxa de sucesso(%)</h5>
              <BarChart />
            </div>
            <div className="col-sm-6">
              <h5 className="text-center text-secondary">Todas vendas</h5>
              <DonutChart />
            </div>
          </div>

          <div className="py-3">
            <h2 className="text-primary">Todas Vendas</h2>
          </div>
        <DataTableJoe />
      </div>
      <Footer />
    </>
    </div>
  );
}

export default Dashboard;
