package com.work.navigationactivity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    private DrawerLayout drawer;
    private View previousView;
    private View previousChildView;
    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setTitle(R.string.app_name);
        }
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.setScrimColor(Color.TRANSPARENT);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                drawer,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close) {

        };
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        int width = (int) (getResources().getDisplayMetrics().widthPixels/1.6);
        DrawerLayout.LayoutParams params = (DrawerLayout.LayoutParams) navigationView.getLayoutParams();
        params.width = width;
        navigationView.setLayoutParams(params);
        mFragmentManager = getSupportFragmentManager();


    }
    /*
     This method is called from xml. This is the main method which will handle the call for particular option
     just write your logic to open activity n fragment on following method click
    */
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.navmain_dashboard :
                mFragmentTransaction = mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.frame_layout, new DashboardFragment());
                mFragmentTransaction.commit();
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.navmain_add_vehicle :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_view_edit_vehicle :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_link_unlink_vehicle :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_add_tyre :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_link_unlink_tyre :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_add_bit :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_view_bit :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_add_hammer :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_view_hammer :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_add_agent :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_expense_head :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_other_charges_head :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_point_entry :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_other_payment_issue :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_labour_role :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_add_labour :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_view_edit_labour :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_labour_link_unlink :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_labour_advance :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_labour_advance_refund :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_vehicle_service_add :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_vehicle_service_maintenance:
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_reports_agent_balance_sheet :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_reports_agent_details :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_reports_tyre :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_reports_bit :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_reports_hammer :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_change_password :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_user_group :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_set_pin :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            case R.id.navmain_logout :
                Toast.makeText(MainActivity.this, ((Button)view).getText().toString(), Toast.LENGTH_SHORT).show();

                break;
            default:
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    /*
     This method is called to show the child and sub child for currently selected element.
      */


    public void showChild(View view){
       switch (view.getId()){
           case R.id.navmain_master:
               if(findViewById(R.id.master_ll).getVisibility()!=View.VISIBLE) {
                   hideChild(view);
                   findViewById(R.id.master_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);

               break;
           case R.id.navmain_point_details:
               if(findViewById(R.id.point_details_ll).getVisibility()!=View.VISIBLE) {
                   hideChild(view);
                   findViewById(R.id.point_details_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);

               break;
           case R.id.navmain_transactions:
               if(findViewById(R.id.transactions_ll).getVisibility()!=View.VISIBLE) {
                   hideChild(view);
                   findViewById(R.id.transactions_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);

               break;
           case R.id.navmain_labour_management_details:
               if(findViewById(R.id.labour_management_details_ll).getVisibility()!=View.VISIBLE) {
                   hideChild(view);
                   findViewById(R.id.labour_management_details_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);

               break;
           case R.id.navmain_services:
               if(findViewById(R.id.services_ll).getVisibility()!=View.VISIBLE) {
                   hideChild(view);
                   findViewById(R.id.services_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);

               break;
           case R.id.navmain_reports:
               if(findViewById(R.id.reports_ll).getVisibility()!=View.VISIBLE) {
                   hideChild(view);
                   findViewById(R.id.reports_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);

               break;
           case R.id.navmain_menu_access_permissions:
               if(findViewById(R.id.menu_access_permission_ll).getVisibility()!=View.VISIBLE) {
                   hideChild(view);
                   findViewById(R.id.menu_access_permission_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);

               break;
           case R.id.navmain_vehicle:
               if(findViewById(R.id.vehicle_ll).getVisibility()!=View.VISIBLE) {
                   hideSubChild(view);
                   findViewById(R.id.vehicle_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideSubChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);
               break;
           case R.id.navmain_tyre:
               if(findViewById(R.id.tyre_ll).getVisibility()!=View.VISIBLE) {
                   hideSubChild(view);
                   findViewById(R.id.tyre_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideSubChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);

               break;
           case R.id.navmain_bit:
               if(findViewById(R.id.bit_ll).getVisibility()!=View.VISIBLE) {
                   hideSubChild(view);
                   findViewById(R.id.bit_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideSubChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);

               break;
           case R.id.navmain_hammer:
               if(findViewById(R.id.hammer_ll).getVisibility()!=View.VISIBLE) {
                   hideSubChild(view);
                   findViewById(R.id.hammer_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideSubChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);

               break;
           case R.id.navmain_receipts_and_advance:
               if(findViewById(R.id.receipts_advance_ll).getVisibility()!=View.VISIBLE) {
                   hideSubChild(view);
                   findViewById(R.id.receipts_advance_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideSubChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);
               break;
           case R.id.navmain_expenses_and_payments:
               if(findViewById(R.id.expenses_and_payments_ll).getVisibility()!=View.VISIBLE) {
                   hideSubChild(view);
                   findViewById(R.id.expenses_and_payments_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideSubChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);
               break;
           case R.id.navmain_reports_point_details:
               if(findViewById(R.id.reports_point_details_ll).getVisibility()!=View.VISIBLE) {
                   hideSubChild(view);
                   findViewById(R.id.reports_point_details_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideSubChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);
               break;
           case R.id.navmain_reports_vehicle:
               if(findViewById(R.id.reports_vehicle_ll).getVisibility()!=View.VISIBLE) {
                   hideSubChild(view);
                   findViewById(R.id.reports_vehicle_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideSubChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);
               break;
           case R.id.navmain_reports_receipts_advance:
               if(findViewById(R.id.reports_receipts_and_advance_ll).getVisibility()!=View.VISIBLE) {
                   hideSubChild(view);
                   findViewById(R.id.reports_receipts_and_advance_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideSubChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);
               break;
           case R.id.navmain_reports_expenses_payments:
               if(findViewById(R.id.reports_expenses_and_payments_ll).getVisibility()!=View.VISIBLE) {
                   hideSubChild(view);
                   findViewById(R.id.reports_expenses_and_payments_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideSubChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);
               break;
           case R.id.navmain_reports_daily_credit_debit:
               if(findViewById(R.id.daily_credit_debit_ll).getVisibility()!=View.VISIBLE) {
                   hideSubChild(view);
                   findViewById(R.id.daily_credit_debit_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideSubChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);
               break;
           case R.id.navmain_reports_balance:
               if(findViewById(R.id.balance_reports_ll).getVisibility()!=View.VISIBLE) {
                   hideSubChild(view);
                   findViewById(R.id.balance_reports_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideSubChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);
               break;
           case R.id.navmain_reports_labour:
               if(findViewById(R.id.labour_ll).getVisibility()!=View.VISIBLE) {
                   hideSubChild(view);
                   findViewById(R.id.labour_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideSubChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);
               break;
           case R.id.navmain_reports_general_alert:
               if(findViewById(R.id.general_alert_ll).getVisibility()!=View.VISIBLE) {
                   hideSubChild(view);
                   findViewById(R.id.general_alert_ll).setVisibility(View.VISIBLE);
                   return;
               }
               hideSubChild(view);
               ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);
               break;
       }
    }


    /*
         This method is called to hide the child for previosly selected element.
          */

    private void hideChild(View view) {
        if(previousView != null){
            ((Button)previousView).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);
        }
        previousView=view;
        ((Button)view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_remove, 0);

        findViewById(R.id.master_ll).setVisibility(View.GONE);
        findViewById(R.id.point_details_ll).setVisibility(View.GONE);
        findViewById(R.id.transactions_ll).setVisibility(View.GONE);
        findViewById(R.id.labour_management_details_ll).setVisibility(View.GONE);
        findViewById(R.id.services_ll).setVisibility(View.GONE);
        findViewById(R.id.reports_ll).setVisibility(View.GONE);
        findViewById(R.id.menu_access_permission_ll).setVisibility(View.GONE);
        hideSubChild(null);
    }

    /*
     This method is called to hide the  sub child for previously selected element.
      */

    private void hideSubChild(View view) {
        if (previousChildView != null) {
            ((Button)previousChildView).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_add, 0);
        }
        if(view!=null) {
            previousChildView = view;
            ((Button) view).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_remove, 0);
        }
        findViewById(R.id.vehicle_ll).setVisibility(View.GONE);
        findViewById(R.id.tyre_ll).setVisibility(View.GONE);
        findViewById(R.id.bit_ll).setVisibility(View.GONE);
        findViewById(R.id.hammer_ll).setVisibility(View.GONE);
        findViewById(R.id.receipts_advance_ll).setVisibility(View.GONE);
        findViewById(R.id.expenses_and_payments_ll).setVisibility(View.GONE);
        findViewById(R.id.reports_point_details_ll).setVisibility(View.GONE);
        findViewById(R.id.reports_vehicle_ll).setVisibility(View.GONE);
        findViewById(R.id.reports_receipts_and_advance_ll).setVisibility(View.GONE);
        findViewById(R.id.reports_expenses_and_payments_ll).setVisibility(View.GONE);
        findViewById(R.id.daily_credit_debit_ll).setVisibility(View.GONE);
        findViewById(R.id.balance_reports_ll).setVisibility(View.GONE);
        findViewById(R.id.labour_ll).setVisibility(View.GONE);
        findViewById(R.id.general_alert_ll).setVisibility(View.GONE);

    }





}
